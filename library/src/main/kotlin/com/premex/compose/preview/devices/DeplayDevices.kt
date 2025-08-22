package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEPLAY device specifications for Android Compose previews.
 *
 * This extension provides DEPLAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Deplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Deplay: Any
  get() = object {
      /** DEPLAY BS101_EEA */
      val BS101_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEPLAY BS703_EEA */
      val BS703_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEPLAY BS801_EEA */
      val BS801_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEPLAY E101GCM */
      val E101GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DEPLAY E108GCM */
      val E108GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DEPLAY LITE4_EEA */
      val LITE4_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEPLAY PRO4 */
      val PRO4 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
