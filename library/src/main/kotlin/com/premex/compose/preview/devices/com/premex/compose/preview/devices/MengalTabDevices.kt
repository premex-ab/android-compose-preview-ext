package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MengalTab device specifications for Android Compose previews.
 *
 * This extension provides MengalTab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MengalTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MengalTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=MengalTab, code=Mengaltab_Echague_anzatech, width=600,
      height=1024, dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MengalTab,
      code=Mengaltab_Echague_anzatech, width=600, height=1024, dpi=160, isGoogleDevice=false).code
      */
      val MENGALTAB_ECHAGUE_ANZATECH = "spec:width=600,height=1024,unit=px,dpi=160"

  }
