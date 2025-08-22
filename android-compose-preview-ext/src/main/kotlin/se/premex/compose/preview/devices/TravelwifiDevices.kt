package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TravelWifi device specifications for Android Compose previews.
 *
 * This extension provides TravelWifi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Travelwifi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Travelwifi: Any
  get() = object {
      /** TravelWifi Sapphire_Tablet */
      val SAPPHIRE_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
