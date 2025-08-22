package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tibuta device specifications for Android Compose previews.
 *
 * This extension provides Tibuta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tibuta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tibuta: Any
  get() = object {
      /** Tibuta A30 */
      val A30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Tibuta A40 */
      val A40 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Tibuta E101 */
      val E101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Tibuta SmartPad_E220 */
      val SMARTPAD_E220 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Tibuta TAB_868_PRO */
      val TAB_868_PRO = "spec:width=800,height=1340,unit=px,dpi=240"

      /** Tibuta Tibuta_MasterPad-E100 */
      val TIBUTA_MASTERPAD_E100 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** Tibuta Tibuta_MasterPad_K100 */
      val TIBUTA_MASTERPAD_K100 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
