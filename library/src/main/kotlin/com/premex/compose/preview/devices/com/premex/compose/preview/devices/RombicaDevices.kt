package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rombica device specifications for Android Compose previews.
 *
 * This extension provides Rombica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rombica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rombica: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rombica, code=myPhone_Jet, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rombica, code=myPhone_Jet,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val MYPHONE_JET = "spec:width=480,height=854,unit=px,dpi=200"

  }
