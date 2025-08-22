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
      /** CONCORD Concord_M20 */
      val CONCORD_M20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CONCORD C-708 */
      val C_708 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONCORD Dream_Edition_C-754 */
      val DREAM_EDITION_C_754 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CONCORD Plus-7_C777 */
      val PLUS_7_C777 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CONCORD Plus_M19_C779 */
      val PLUS_M19_C779 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
