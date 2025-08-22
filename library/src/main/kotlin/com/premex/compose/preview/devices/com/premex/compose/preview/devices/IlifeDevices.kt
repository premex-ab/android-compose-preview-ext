package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * I-life device specifications for Android Compose previews.
 *
 * This extension provides I-life device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ilife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ilife: Any
  get() = object {
      /** DeviceSpec(manufacturer=I-life, code=ITELL_K3102N, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-life, code=ITELL_K3102N,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ITELL_K3102N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=I-life, code=ITELL_K3500N, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-life, code=ITELL_K3500N,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ITELL_K3500N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=I-life, code=ITELL_K3800Q, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-life, code=ITELL_K3800Q,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ITELL_K3800Q = "spec:width=800,height=1280,unit=px,dpi=160"

  }
