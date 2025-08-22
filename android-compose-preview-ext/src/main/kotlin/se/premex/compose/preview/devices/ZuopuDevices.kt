package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZUOPU device specifications for Android Compose previews.
 *
 * This extension provides ZUOPU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zuopu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zuopu: Any
  get() = object {
      /** ZUOPU JH101 */
      val JH101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZUOPU JH103 */
      val JH103 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZUOPU JH105 */
      val JH105 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZUOPU JH863 */
      val JH863 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
