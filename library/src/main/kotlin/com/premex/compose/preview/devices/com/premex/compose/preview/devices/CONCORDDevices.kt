package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONCORD device specifications for Android Compose previews.
 *
 * This extension provides CONCORD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONCORD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONCORD: Any
  get() = object {
      /** DeviceSpec(manufacturer=CONCORD, code=Concord_M20, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONCORD, code=Concord_M20,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CONCORD_M20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONCORD, code=C-708, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONCORD, code=C-708, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C_708 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONCORD, code=Dream_Edition_C-754, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONCORD,
      code=Dream_Edition_C-754, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val DREAM_EDITION_C_754 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CONCORD, code=Plus-7_C777, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONCORD, code=Plus-7_C777,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PLUS_7_C777 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONCORD, code=Plus_M19_C779, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONCORD, code=Plus_M19_C779,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PLUS_M19_C779 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
