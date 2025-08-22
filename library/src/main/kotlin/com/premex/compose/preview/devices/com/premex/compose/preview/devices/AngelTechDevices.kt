package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AngelTech device specifications for Android Compose previews.
 *
 * This extension provides AngelTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AngelTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AngelTech: Any
  get() = object {
      /** DeviceSpec(manufacturer=AngelTech, code=E109GCM, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AngelTech, code=E109GCM, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val E109GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=AngelTech, code=P80, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AngelTech, code=P80, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
