package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AX_META device specifications for Android Compose previews.
 *
 * This extension provides AX_META device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXMETA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXMETA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AX_META, code=AX_META_Tab_7, width=600, height=1024, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AX_META, code=AX_META_Tab_7,
      width=600, height=1024, dpi=180, isGoogleDevice=false).code */
      val AX_META_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=180"

  }
