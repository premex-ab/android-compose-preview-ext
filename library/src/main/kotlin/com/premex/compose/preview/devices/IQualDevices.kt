package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iQual device specifications for Android Compose previews.
 *
 * This extension provides iQual device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQual.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQual: Any
  get() = object {
      /** iQual T10G */
      val T10G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iQual T10L */
      val T10L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iQual T10W */
      val T10W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iQual T7G */
      val T7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iQual T7L */
      val T7L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** iQual T7W */
      val T7W = "spec:width=600,height=1024,unit=px,dpi=160"

  }
