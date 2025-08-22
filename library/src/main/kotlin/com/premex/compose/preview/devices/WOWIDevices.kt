package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOWI device specifications for Android Compose previews.
 *
 * This extension provides WOWI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOWI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOWI: Any
  get() = object {
      /** WOWI S8e */
      val S8E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WOWI SQ753 */
      val SQ753 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WOWI SQ788 */
      val SQ788 = "spec:width=480,height=854,unit=px,dpi=213"

      /** WOWI SQ788_1 */
      val SQ788_1 = "spec:width=480,height=854,unit=px,dpi=213"

      /** WOWI Tab_X5 */
      val TAB_X5 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
