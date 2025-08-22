package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STG-Telecom device specifications for Android Compose previews.
 *
 * This extension provides STG-Telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STGTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STGTelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=STG-Telecom, code=STG-KeyTab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG-Telecom, code=STG-KeyTab,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val STG_KEYTAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
