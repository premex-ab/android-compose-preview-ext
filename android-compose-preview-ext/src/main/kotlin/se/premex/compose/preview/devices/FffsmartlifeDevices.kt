package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FFFSMARTLIFE device specifications for Android Compose previews.
 *
 * This extension provides FFFSMARTLIFE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fffsmartlife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fffsmartlife: Any
  get() = object {
      /** FFFSMARTLIFE F3T10A3 */
      val F3T10A3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FFFSMARTLIFE F3T10B1 */
      val F3T10B1 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FFFSMARTLIFE F3T7B1 */
      val F3T7B1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FFFSMARTLIFE FFFTAB10 */
      val FFFTAB10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FFFSMARTLIFE FFFTAB10a0 */
      val FFFTAB10A0 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FFFSMARTLIFE FFFTAB10a1 */
      val FFFTAB10A1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FFFSMARTLIFE FFFTAB10a2 */
      val FFFTAB10A2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FFFSMARTLIFE FFFTAB10a3 */
      val FFFTAB10A3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FFFSMARTLIFE FFFTAB10a4 */
      val FFFTAB10A4 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FFFSMARTLIFE FFFTAB10b0 */
      val FFFTAB10B0 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FFFSMARTLIFE FFFTAB10b1 */
      val FFFTAB10B1 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FFFSMARTLIFE FFFTAB10b3 */
      val FFFTAB10B3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FFFSMARTLIFE FFFTAB7 */
      val FFFTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FFFSMARTLIFE FFFTAB8 */
      val FFFTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
