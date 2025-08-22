package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TV360_by_Bitel device specifications for Android Compose previews.
 *
 * This extension provides TV360_by_Bitel device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TV360byBitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TV360byBitel: Any
  get() = object {
      /** DeviceSpec(manufacturer=TV360_by_Bitel, code=B866V2FAS_Bitel, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TV360_by_Bitel,
      code=B866V2FAS_Bitel, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val B866V2FAS_BITEL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
