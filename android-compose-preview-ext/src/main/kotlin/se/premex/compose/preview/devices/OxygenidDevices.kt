package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OxygenId device specifications for Android Compose previews.
 *
 * This extension provides OxygenId device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oxygenid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oxygenid: Any
  get() = object {
      /** OxygenId B866V2FA */
      val B866V2FA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
