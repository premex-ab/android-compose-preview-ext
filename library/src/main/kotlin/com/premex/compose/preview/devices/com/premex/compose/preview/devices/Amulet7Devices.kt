package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * amulet7 device specifications for Android Compose previews.
 *
 * This extension provides amulet7 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amulet7.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amulet7: Any
  get() = object {
      /** DeviceSpec(manufacturer=amulet7, code=P10SU_Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=amulet7, code=P10SU_Plus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P10SU_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=amulet7, code=P10SU_PLUS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=amulet7, code=P10SU_PLUS,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val P10SU_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=amulet7, code=P10SU_Pro, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=amulet7, code=P10SU_Pro, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val P10SU_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

  }
