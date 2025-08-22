package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * yyswie device specifications for Android Compose previews.
 *
 * This extension provides yyswie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yyswie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yyswie: Any
  get() = object {
      /** DeviceSpec(manufacturer=yyswie, code=A74W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=yyswie, code=A74W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A74W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=yyswie, code=CT1001, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=yyswie, code=CT1001, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CT1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=yyswie, code=CT1001_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=yyswie, code=CT1001_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CT1001_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
