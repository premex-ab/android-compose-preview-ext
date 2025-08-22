package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TelekomTV device specifications for Android Compose previews.
 *
 * This extension provides TelekomTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TelekomTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TelekomTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=TelekomTV, code=DV8519B-Telekom, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TelekomTV, code=DV8519B-Telekom,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8519B_TELEKOM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TelekomTV, code=SEI800DT-Telekom, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TelekomTV,
      code=SEI800DT-Telekom, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI800DT_TELEKOM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
