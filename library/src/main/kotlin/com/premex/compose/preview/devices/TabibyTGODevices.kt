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
      /** Tabi_by_T_GO EUTB_758G */
      val EUTB_758G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Tabi_by_T_GO EUTB_758_Argos */
      val EUTB_758_ARGOS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
