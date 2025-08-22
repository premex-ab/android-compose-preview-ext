package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEGA device specifications for Android Compose previews.
 *
 * This extension provides VEGA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vega.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vega: Any
  get() = object {
      /** VEGA ef49k */
      val EF49K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VEGA ef51k */
      val EF51K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA ef52k */
      val EF52K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VEGA ef52s */
      val EF52S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VEGA EF56S */
      val EF56S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA EF59K */
      val EF59K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA EF59L */
      val EF59L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA EF59S */
      val EF59S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA ef60s */
      val EF60S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA ef61k */
      val EF61K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA ef63k */
      val EF63K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA ef63s */
      val EF63S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VEGA tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VEGA yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
