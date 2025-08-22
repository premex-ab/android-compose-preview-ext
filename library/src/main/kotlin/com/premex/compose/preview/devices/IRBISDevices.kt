package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRBIS device specifications for Android Compose previews.
 *
 * This extension provides IRBIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRBIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRBIS: Any
  get() = object {
      /** IRBIS SP514 */
      val SP514 = "spec:width=480,height=854,unit=px,dpi=240"

      /** IRBIS SP542 */
      val SP542 = "spec:width=480,height=960,unit=px,dpi=240"

      /** IRBIS SP554 */
      val SP554 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** IRBIS TZ151 */
      val TZ151 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ165 */
      val TZ165 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ175 */
      val TZ175 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRBIS TZ179 */
      val TZ179 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ195 */
      val TZ195 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ197 */
      val TZ197 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRBIS TZ198 */
      val TZ198 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRBIS TZ199 */
      val TZ199 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** IRBIS TZ200 */
      val TZ200 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** IRBIS TZ711 */
      val TZ711 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRBIS TZ718 */
      val TZ718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ719 */
      val TZ719 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ720 */
      val TZ720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ722 */
      val TZ722 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ725 */
      val TZ725 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ728 */
      val TZ728 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRBIS TZ737 */
      val TZ737 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ754 */
      val TZ754 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRBIS TZ772 */
      val TZ772 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ773 */
      val TZ773 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRBIS TZ777 */
      val TZ777 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRBIS TZ797 */
      val TZ797 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRBIS TZ832 */
      val TZ832 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ855 */
      val TZ855 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ856 */
      val TZ856 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ897 */
      val TZ897 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRBIS TZ960 */
      val TZ960 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ963 */
      val TZ963 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ965 */
      val TZ965 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ968 */
      val TZ968 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRBIS TZ969 */
      val TZ969 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
