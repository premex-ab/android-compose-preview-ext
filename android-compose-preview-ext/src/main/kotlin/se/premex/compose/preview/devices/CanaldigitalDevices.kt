package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CanalDigital device specifications for Android Compose previews.
 *
 * This extension provides CanalDigital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Canaldigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Canaldigital: Any
  get() = object {
      /** CanalDigital OnePlace2 */
      val ONEPLACE2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
