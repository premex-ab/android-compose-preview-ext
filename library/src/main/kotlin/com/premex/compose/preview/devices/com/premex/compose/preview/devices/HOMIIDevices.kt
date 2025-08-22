package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOMII device specifications for Android Compose previews.
 *
 * This extension provides HOMII device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOMII.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOMII: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOMII, code=M6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=M6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMII, code=XBOOK, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=XBOOK, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XBOOK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMII, code=Xbookkids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=Xbookkids, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XBOOKKIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMII, code=XBOOK_12, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=XBOOK_12, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XBOOK_12 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMII, code=Xbook_Plus, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=Xbook_Plus, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val XBOOK_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HOMII, code=XBOOK_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMII, code=XBOOK_PRO, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XBOOK_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
