package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Connex device specifications for Android Compose previews.
 *
 * This extension provides Connex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Connex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Connex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Connex, code=CTAB1044hn, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Connex, code=CTAB1044hn, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CTAB1044HN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Connex, code=CTAB-1044, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Connex, code=CTAB-1044, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CTAB_1044 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Connex, code=SEN_1055_ARM, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Connex, code=SEN_1055_ARM,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SEN_1055_ARM = "spec:width=800,height=1280,unit=px,dpi=160"

  }
