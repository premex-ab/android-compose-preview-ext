package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AEEZO device specifications for Android Compose previews.
 *
 * This extension provides AEEZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aeezo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aeezo: Any
  get() = object {
      /** AEEZO TK701 */
      val TK701 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** AEEZO TK701_EEA */
      val TK701_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AEEZO TK801 */
      val TK801 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AEEZO TK806 */
      val TK806 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AEEZO TK806_EEA */
      val TK806_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AEEZO TK809 */
      val TK809 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AEEZO TK809_EEA */
      val TK809_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AEEZO TP1001 */
      val TP1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AEEZO TP901 */
      val TP901 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
