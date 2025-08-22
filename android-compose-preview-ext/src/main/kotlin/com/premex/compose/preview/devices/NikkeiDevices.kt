package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NIKKEI device specifications for Android Compose previews.
 *
 * This extension provides NIKKEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nikkei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nikkei: Any
  get() = object {
      /** NIKKEI ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NIKKEI longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NIKKEI R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NIKKEI R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NIKKEI redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NIKKEI samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
