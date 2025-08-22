package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KDDI_u device specifications for Android Compose previews.
 *
 * This extension provides KDDI_u device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KDDIu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KDDIu: Any
  get() = object {
      /** DeviceSpec(manufacturer=KDDI_u, code=FSP_u, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI_u, code=FSP_u, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FSP_U = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI_u, code=KXU_u, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI_u, code=KXU_u, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KXU_U = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI_u, code=MZW-u, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI_u, code=MZW-u, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MZW_U = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI_u, code=PCZ-u, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI_u, code=PCZ-u, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PCZ_U = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI_u, code=SCV43-u, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI_u, code=SCV43-u, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SCV43_U = "spec:width=1080,height=2340,unit=px,dpi=420"

  }
