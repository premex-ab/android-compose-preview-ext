package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VALE device specifications for Android Compose previews.
 *
 * This extension provides VALE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VALE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VALE: Any
  get() = object {
      /** VALE V10A-4128 */
      val V10A_4128 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VALE V10E-LTE */
      val V10E_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VALE V11E_LTE_4128 */
      val V11E_LTE_4128 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** VALE V12E-LTE */
      val V12E_LTE = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** VALE V12E_LTE_8128 */
      val V12E_LTE_8128 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
