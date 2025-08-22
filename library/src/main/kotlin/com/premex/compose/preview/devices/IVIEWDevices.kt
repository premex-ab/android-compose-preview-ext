package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IVIEW device specifications for Android Compose previews.
 *
 * This extension provides IVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IVIEW: Any
  get() = object {
      /** IVIEW IVIEW_1170TPC */
      val IVIEW_1170TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IVIEW 1016TPC */
      val _1016TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IVIEW 816TPC */
      val _816TPC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
