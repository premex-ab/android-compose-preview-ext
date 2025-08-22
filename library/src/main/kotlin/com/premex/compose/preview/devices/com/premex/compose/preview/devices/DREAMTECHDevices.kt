package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DREAMTECH device specifications for Android Compose previews.
 *
 * This extension provides DREAMTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DREAMTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DREAMTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=DREAMTECH, code=DTECH10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DREAMTECH, code=DTECH10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val DTECH10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DREAMTECH, code=KIDDOTAB10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DREAMTECH, code=KIDDOTAB10,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val KIDDOTAB10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DREAMTECH, code=STARPAD, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DREAMTECH, code=STARPAD, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STARPAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DREAMTECH, code=STARPAD_PLUS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DREAMTECH, code=STARPAD_PLUS,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val STARPAD_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DREAMTECH, code=VOLTA_X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DREAMTECH, code=VOLTA_X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VOLTA_X = "spec:width=800,height=1280,unit=px,dpi=213"

  }
