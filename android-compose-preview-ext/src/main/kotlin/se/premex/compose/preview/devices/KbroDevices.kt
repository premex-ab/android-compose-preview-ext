package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * kbro device specifications for Android Compose previews.
 *
 * This extension provides kbro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kbro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kbro: Any
  get() = object {
      /** kbro sti6160d19 */
      val STI6160D19 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
