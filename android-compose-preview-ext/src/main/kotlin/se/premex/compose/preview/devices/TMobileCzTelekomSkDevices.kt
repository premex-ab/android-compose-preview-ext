package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * T-Mobile-CZ-Telekom-SK device specifications for Android Compose previews.
 *
 * This extension provides T-Mobile-CZ-Telekom-SK device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TMobileCzTelekomSk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TMobileCzTelekomSk: Any
  get() = object {
      /** T-Mobile-CZ-Telekom-SK HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
