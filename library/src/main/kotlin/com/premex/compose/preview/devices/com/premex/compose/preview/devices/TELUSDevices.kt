package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELUS device specifications for Android Compose previews.
 *
 * This extension provides TELUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TELUS, code=SER2024TLU, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELUS, code=SER2024TLU, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SER2024TLU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TELUS, code=uiw4054tlu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELUS, code=uiw4054tlu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4054TLU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
