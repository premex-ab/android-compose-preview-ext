package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TERRA device specifications for Android Compose previews.
 *
 * This extension provides TERRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TERRA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TERRA: Any
  get() = object {
      /** TERRA TERRA_PAD_1005 */
      val TERRA_PAD_1005 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TERRA TERRA_PAD_1005POKO */
      val TERRA_PAD_1005POKO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TERRA TERRA_PAD_1006 */
      val TERRA_PAD_1006 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TERRA TERRA_PAD_1006_V2 */
      val TERRA_PAD_1006_V2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TERRA TERRA_PAD_1007 */
      val TERRA_PAD_1007 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TERRA TERRA_PAD_1201 */
      val TERRA_PAD_1201 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
