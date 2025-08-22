package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * X-AGE device specifications for Android Compose previews.
 *
 * This extension provides X-AGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XAge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XAge: Any
  get() = object {
      /** X-AGE A1 */
      val A1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** X-AGE ACE */
      val ACE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** X-AGE G1 */
      val G1 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** X-AGE G1LITE */
      val G1LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** X-AGE G2 */
      val G2 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** X-AGE X_AGE_Leap_1 */
      val X_AGE_LEAP_1 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** X-AGE X_AGE_Snap_1 */
      val X_AGE_SNAP_1 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
