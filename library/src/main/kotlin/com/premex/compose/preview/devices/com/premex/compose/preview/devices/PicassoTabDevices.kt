package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PicassoTab device specifications for Android Compose previews.
 *
 * This extension provides PicassoTab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PicassoTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PicassoTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=PicassoTab, code=A10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PicassoTab, code=A10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=PicassoTab, code=PicassoTab_X11_2025, width=1200, height=2000,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PicassoTab,
      code=PicassoTab_X11_2025, width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val PICASSOTAB_X11_2025 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PicassoTab, code=X11, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PicassoTab, code=X11, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val X11 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
