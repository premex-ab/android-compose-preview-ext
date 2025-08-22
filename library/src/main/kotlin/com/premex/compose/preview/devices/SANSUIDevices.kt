package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SANSUI device specifications for Android Compose previews.
 *
 * This extension provides SANSUI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SANSUI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SANSUI: Any
  get() = object {
      /** SANSUI cottongreen */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SANSUI marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SANSUI martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANSUI nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANSUI shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANSUI shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SANSUI stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANSUI sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANSUI SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SANSUI yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
