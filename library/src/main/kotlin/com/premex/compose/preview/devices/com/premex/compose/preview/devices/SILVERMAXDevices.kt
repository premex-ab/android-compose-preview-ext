package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SILVER_MAX device specifications for Android Compose previews.
 *
 * This extension provides SILVER_MAX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SILVERMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SILVERMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=SILVER_MAX, code=ST_710G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SILVER_MAX, code=ST_710G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ST_710G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SILVER_MAX, code=ST-810, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SILVER_MAX, code=ST-810, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ST_810 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SILVER_MAX, code=ST_810A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SILVER_MAX, code=ST_810A,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ST_810A = "spec:width=600,height=1024,unit=px,dpi=160"

  }
