package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tabi_by_T_GO device specifications for Android Compose previews.
 *
 * This extension provides Tabi_by_T_GO device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TabibyTGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TabibyTGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tabi_by_T_GO, code=EUTB_758G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tabi_by_T_GO, code=EUTB_758G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val EUTB_758G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tabi_by_T_GO, code=EUTB_758_Argos, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tabi_by_T_GO,
      code=EUTB_758_Argos, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val EUTB_758_ARGOS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
