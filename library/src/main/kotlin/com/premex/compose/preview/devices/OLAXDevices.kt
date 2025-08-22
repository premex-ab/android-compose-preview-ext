package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OLAX device specifications for Android Compose previews.
 *
 * This extension provides OLAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OLAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OLAX: Any
  get() = object {
      /** OLAX Magic_Q1 */
      val MAGIC_Q1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** OLAX Magic_Q8 */
      val MAGIC_Q8 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OLAX Ocean_F8 */
      val OCEAN_F8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OLAX Ocean_K10 */
      val OCEAN_K10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OLAX Ocean_K8 */
      val OCEAN_K8 = "spec:width=800,height=1280,unit=px,dpi=280"

      /** OLAX Ocean_K8_Pro */
      val OCEAN_K8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
