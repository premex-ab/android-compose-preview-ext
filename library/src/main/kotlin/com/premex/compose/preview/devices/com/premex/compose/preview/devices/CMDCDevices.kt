package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CMDC device specifications for Android Compose previews.
 *
 * This extension provides CMDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CMDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CMDC: Any
  get() = object {
      /** DeviceSpec(manufacturer=CMDC, code=HS8916QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CMDC, code=HS8916QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
