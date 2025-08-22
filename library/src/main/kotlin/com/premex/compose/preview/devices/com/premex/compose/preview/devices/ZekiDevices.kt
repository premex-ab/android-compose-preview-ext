package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zeki device specifications for Android Compose previews.
 *
 * This extension provides Zeki device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zeki.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zeki: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zeki, code=TBDV986, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zeki, code=TBDV986, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TBDV986 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zeki, code=TBOG1034, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zeki, code=TBOG1034, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TBOG1034 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zeki, code=TBQG1038, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zeki, code=TBQG1038, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TBQG1038 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
