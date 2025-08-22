package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Omix device specifications for Android Compose previews.
 *
 * This extension provides Omix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Omix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Omix: Any
  get() = object {
      /** Omix MixTab_Pro */
      val MIXTAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
