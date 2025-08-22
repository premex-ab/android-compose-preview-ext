package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * d_light device specifications for Android Compose previews.
 *
 * This extension provides d_light device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DLight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DLight: Any
  get() = object {
      /** d_light M100 */
      val M100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** d_light M1000 */
      val M1000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** d_light M200 */
      val M200 = "spec:width=480,height=854,unit=px,dpi=240"

  }
