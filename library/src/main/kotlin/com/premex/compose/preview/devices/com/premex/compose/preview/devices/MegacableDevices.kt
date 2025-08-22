package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Megacable device specifications for Android Compose previews.
 *
 * This extension provides Megacable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Megacable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Megacable: Any
  get() = object {
      /** DeviceSpec(manufacturer=Megacable, code=B826C-A12_ZTE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=B826C-A12_ZTE,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B826C_A12_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Megacable, code=B866V2F, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=B866V2F,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B866V2F = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Megacable, code=B866V2_ZTE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=B866V2_ZTE,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B866V2_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Megacable, code=HP46A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=HP46A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP46A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Megacable, code=ucw4046meg, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=ucw4046meg,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UCW4046MEG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Megacable, code=uiw4059meg, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Megacable, code=uiw4059meg,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4059MEG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
