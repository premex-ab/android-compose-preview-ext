package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MLAB device specifications for Android Compose previews.
 *
 * This extension provides MLAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mlab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mlab: Any
  get() = object {
      /** MLAB MB4_3G */
      val MB4_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MLAB MB4_WIFI */
      val MB4_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MLAB MB8866 */
      val MB8866 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MLAB 9095 */
      val _9095 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MLAB 9096 */
      val _9096 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MLAB 9098 */
      val _9098 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MLAB 9342 */
      val _9342 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** MLAB 9343 */
      val _9343 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MLAB 9344 */
      val _9344 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
