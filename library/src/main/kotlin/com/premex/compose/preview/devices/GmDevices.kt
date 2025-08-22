package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * gm device specifications for Android Compose previews.
 *
 * This extension provides gm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gm: Any
  get() = object {
      /** gm aegean */
      val AEGEAN = "spec:width=974,height=2000,unit=px,dpi=160"

      /** gm burmese */
      val BURMESE = "spec:width=1134,height=2914,unit=px,dpi=200"

      /** gm gm5plustkc_s_sprout */
      val GM5PLUSTKC_S_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** gm gm5plus_sprout */
      val GM5PLUS_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** gm gm5plus_s_sprout */
      val GM5PLUS_S_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** gm gm5_sprout */
      val GM5_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** gm gm5_s_sprout */
      val GM5_S_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** gm GM8_go */
      val GM8_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** gm GM8_go_sc */
      val GM8_GO_SC = "spec:width=720,height=1440,unit=px,dpi=320"

  }
