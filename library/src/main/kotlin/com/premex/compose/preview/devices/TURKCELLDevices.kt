package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TURKCELL device specifications for Android Compose previews.
 *
 * This extension provides TURKCELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TURKCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TURKCELL: Any
  get() = object {
      /** TURKCELL P809T70 */
      val P809T70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TURKCELL P839T60 */
      val P839T60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TURKCELL P840F14 */
      val P840F14 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TURKCELL Turkcell_T_Tablet */
      val TURKCELL_T_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
