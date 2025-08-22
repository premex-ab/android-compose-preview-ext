package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * I_KALL device specifications for Android Compose previews.
 *
 * This extension provides I_KALL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IKall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IKall: Any
  get() = object {
      /** I_KALL K510 */
      val K510 = "spec:width=480,height=854,unit=px,dpi=200"

      /** I_KALL S3 */
      val S3 = "spec:width=1080,height=2460,unit=px,dpi=400"

      /** I_KALL Z19 */
      val Z19 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** I_KALL Z20 */
      val Z20 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
