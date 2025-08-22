package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONTIXO device specifications for Android Compose previews.
 *
 * This extension provides CONTIXO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONTIXO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONTIXO: Any
  get() = object {
      /** CONTIXO CONTIXO-V8 */
      val CONTIXO_V8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO CONTIXO-V9 */
      val CONTIXO_V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO K101A */
      val K101A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CONTIXO K103 */
      val K103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CONTIXO K103A */
      val K103A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CONTIXO K81 */
      val K81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CONTIXO V10 */
      val V10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V10A */
      val V10A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V10S */
      val V10S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V10X */
      val V10X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V11 */
      val V11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CONTIXO V8X */
      val V8X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V90 */
      val V90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONTIXO V9X */
      val V9X = "spec:width=600,height=1024,unit=px,dpi=160"

  }
