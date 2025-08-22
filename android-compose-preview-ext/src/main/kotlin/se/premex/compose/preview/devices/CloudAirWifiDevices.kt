package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CLOUD_AiR-WiFi device specifications for Android Compose previews.
 *
 * This extension provides CLOUD_AiR-WiFi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CloudAirWifi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CloudAirWifi: Any
  get() = object {
      /** CLOUD_AiR-WiFi ATab-1 */
      val ATAB_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
