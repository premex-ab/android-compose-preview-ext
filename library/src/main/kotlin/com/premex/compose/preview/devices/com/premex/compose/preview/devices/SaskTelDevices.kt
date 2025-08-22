package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SaskTel device specifications for Android Compose previews.
 *
 * This extension provides SaskTel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SaskTel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SaskTel: Any
  get() = object {
      /** DeviceSpec(manufacturer=SaskTel, code=HMB2213PW22WA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SaskTel, code=HMB2213PW22WA,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HMB2213PW22WA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SaskTel, code=uiw4054sas, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SaskTel, code=uiw4054sas,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4054SAS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
