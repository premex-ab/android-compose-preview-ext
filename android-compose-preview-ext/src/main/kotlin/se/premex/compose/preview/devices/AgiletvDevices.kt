package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AgileTV device specifications for Android Compose previews.
 *
 * This extension provides AgileTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Agiletv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Agiletv: Any
  get() = object {
      /** AgileTV DV9157-T2-KIA */
      val DV9157_T2_KIA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** AgileTV dwt765mm */
      val DWT765MM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AgileTV uzw4060mm */
      val UZW4060MM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
